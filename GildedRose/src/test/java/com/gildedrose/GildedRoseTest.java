package com.gildedrose;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

  @Test
  void foo() {
    String itemName = "foo";
    Item[] items = new Item[]{new Item(itemName, 0, 0)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.items[0].name, equalTo(itemName));
  }

  @Test
  void qualityOfNormalItemDecreasesByOne() {
    Item item = updateQuality(new Item("Normal Item", 10, 20));
    assertThat(item.sellIn, equalTo(9));
    assertThat(item.quality, equalTo(19));
  }

  private static Item updateQuality(Item originalItem) {
    return updateQuality(originalItem, 1);
  }

  private static Item updateQuality(Item originalItem, int numberOfDays) {
    Item[] items = new Item[]{originalItem};
    GildedRose app = new GildedRose(items);
    for (int i = 0; i < numberOfDays; i++) {
      app.updateQuality();
    }
    return app.items[0];
  }

  @Test
  void qualityOfAgedBrieIncreasesByOne() {
    Item item = updateQuality(new Item("Aged Brie", 2, 0));
    assertThat(item.sellIn, equalTo(1));
    assertThat(item.quality, equalTo(1));
  }

  @Test
  void maximumQualityOfAgedBrieIsFifty() {
    Item item = updateQuality(new Item("Aged Brie", 2, 50));
    assertThat(item.sellIn, equalTo(1));
    assertThat(item.quality, equalTo(50));
  }

  @Disabled // Conjured items not implemented yet
  @Test
  void qualityOfConjuredItemDecreasesByTwo() {
    Item item = updateQuality(new Item("Conjured Item", 3, 6));
    assertThat(item.sellIn, equalTo(2));
    assertThat(item.quality, equalTo(4));
  }

  @Test
  void qualityOfBackstageDropsToZeroAfterConcert() {
    Item item = updateQuality(new Item("Backstage passes to a TAFKAL80ETC concert", 0, 57));
    assertThat(item.sellIn, equalTo(-1));
    assertThat(item.quality, equalTo(0));
  }

  @Test
  void qualityOfItemDecreasesTwiceAsFastAfterSellInDate() {
    Item item = updateQuality(new Item("Normal Item", 0, 20));
    assertThat(item.sellIn, equalTo(-1));
    assertThat(item.quality, equalTo(18));
  }

  @Test
  void qualityOfBackstagePassIncreasesByOneWhenSellInIsMoreThanTen() {
    Item item = updateQuality(new Item("Backstage passes to a TAFKAL80ETC concert", 17, 20), 7);
    assertThat(item.sellIn, equalTo(10));
    assertThat(item.quality, equalTo(27));
  }

  @Test
  void qualityOfBackstagePassIncreasesByTwoWhenSellInIsTenOrLess() {
    Item item = updateQuality(new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20), 5);
    assertThat(item.sellIn, equalTo(5));
    assertThat(item.quality, equalTo(30));
  }

  @Test
  void qualityOfBackstagePassIncreasesByThreeWhenSellInIsFiveOrLess() {
    Item item = updateQuality(new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20), 3);
    assertThat(item.sellIn, equalTo(2));
    assertThat(item.quality, equalTo(29));
  }

  @Test
  void qualityOfSulfurasNeverChanges() {
    Item item = updateQuality(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
    assertThat(item.sellIn, equalTo(0));
    assertThat(item.quality, equalTo(80));
  }

  @Test
  void qualityOfSulfurasNeverDecreases() {
    Item item = updateQuality(new Item("Sulfuras, Hand of Ragnaros", 0, 80), 10);
    assertThat(item.sellIn, equalTo(0));
    assertThat(item.quality, equalTo(80));
  }
}

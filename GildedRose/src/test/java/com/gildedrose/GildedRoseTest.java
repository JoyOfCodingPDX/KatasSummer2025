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
        Item[] items = new Item[] { new Item(itemName, 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, equalTo(itemName));
    }

    @Test
    void qualityOfNormalItemDecreasesByOne() {
        Item[] items = new Item[] { new Item("Normal Item", 10, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, equalTo(9));
        assertThat(app.items[0].quality, equalTo(19));
    }

    @Test
    void qualityOfAgedBrieIncreasesByOne() {
        Item[] items = new Item[] { new Item("Aged Brie", 2, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, equalTo(1));
        assertThat(app.items[0].quality, equalTo(1));
    }
}

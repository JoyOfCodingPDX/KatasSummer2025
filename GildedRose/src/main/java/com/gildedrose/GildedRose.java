package com.gildedrose;

class GildedRose {
    static final int MAXIMUM_QUALITY = 50;
    static final String AGED_BRIE = "Aged Brie";
    static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
      for (Item item : items) {
        if (!item.name.equals(AGED_BRIE)
          && !item.name.equals(BACKSTAGE_PASSES)) {
          if (item.quality > 0) {
            if (!item.name.equals(SULFURAS)) {
              item.quality--;
            }
          }
        } else {
          if (item.quality < MAXIMUM_QUALITY) {
            item.quality++;

            if (item.name.equals(BACKSTAGE_PASSES)) {
              if (item.sellIn < 11) {
                if (item.quality < MAXIMUM_QUALITY) {
                  item.quality++;
                }
              }

              if (item.sellIn < 6) {
                if (item.quality < MAXIMUM_QUALITY) {
                  item.quality++;
                }
              }
            }
          }
        }

        if (!item.name.equals(SULFURAS)) {
          item.sellIn--;
        }

        if (item.sellIn < 0) {
          if (!item.name.equals(AGED_BRIE)) {
            if (!item.name.equals(BACKSTAGE_PASSES)) {
              if (item.quality > 0) {
                if (!item.name.equals(SULFURAS)) {
                  item.quality--;
                }
              }
            } else {
              item.quality = 0;
            }
          } else {
            if (item.quality < MAXIMUM_QUALITY) {
              item.quality++;
            }
          }
        }
      }
    }
}

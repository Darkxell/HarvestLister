# HarvestLister
Listing API for harvest crafts, and neat formatting for happy discord pasting

## Usage

As simple as it gets:

```java
  ParsedPage page = new ParsedPage("ukariukiyonito");
	page.clipboard();
```

Will parse https://poe.trade/search/ukariukiyonito and put a nice discord formated massage to your clipboard.
Just make a poe.trade search for your own account to get your own crafts.

For exemple, the search above may return:

```
Page: https://poe.trade/search/ukariukiyonito

AUGMENT :exalt:

[x1] Cold

REMOVE+AUGMENT :annulment: :exalt:

[x7] Caster

REMOVE+AUGMENT NON :annulment: :exalt: :exclamation:

[x2] Attack
[x3] Cold

OTHER :letouc:

[x1] Fracture in 5 mods
```

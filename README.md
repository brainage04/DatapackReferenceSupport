# About
This server-side mod allows datapack JSON files to reference other datapack JSON files, making the creation of complex datapacks such as those that contain procedurally generated structures much easier.

For example, processor lists have an added `processor_type` called `reference` that allows a processor list to reference another processor list, instead of having to manually copy-paste the second processor list items into the first processor list. This is much better than the alternative of creating a bunch of Python scripts to essentially do the copy-pasting for you (which is what I did before creating this mod).

Similarly, loot pools have an added optional `additional_pools` field that can either be a string referencing another loot table or a list referencing several other loot tables.

#!/usr/bin/env python3.7
names = []
while 1:
    currentName = input("Type a name to add to the list, or type 'exit' to quit")
    if currentName == "exit":
        break
    names.append(currentName)

namesFile = open("names.txt", "a")
for name in names:
    namesFile.write(name + "\n")
namesFile.close()

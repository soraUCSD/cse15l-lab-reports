### less
`$ less -N test.txt` <br>
output: <br>
```
      1 Once upon a humoon
      2 There is many cats
      3 they are very cute.
test.txt (END)
```
: show number of each line, so it is easy to find a line according to the number or check which line the sentence is located.

`$ less -X test.txt`
```
Once upon a humoon
There is many cats
they are very cute.
test.txt (END)
```
:leave file contents on screen, so it is easier to see it later.

`$ less -pc test.txt`
```
On[c]e upon a humoon
There is many [c]ats
they are very [c]ute.
~
~
~
test.txt (END)
```

: open file with pattern search, so we can find the substring in the file easily.

### find

`find . -type d -name some_dir_test` <br>
```
./some_dir_test
```
: specify finding a directory (f instead of d for file), so when we only care about either of them we can use it to specify which one we want.

`find . -name test.txt -exec rm -i {} \;`
```
remove ./test.txt? y
```
: find and delete a file(s) with confirmation, this works for multiple files so it will be easier to delete multple files at once.

`find . -empty`
```
./empty_dir
./test.txt
```
: search for empty files and directories, so maybe we want to find and delete the empty files and directory to keep the place clean.

### grep

`grep -i "c" test.txt`
```
Once upon a humoon
There is many cats
they are very cute.
```
: case insensitive search, it is useful when we want to find a substring regardless of the case

`grep -c "c" test.txt`
```
3
```
: display the count of number of match, so we know how many number of match substring there is in the file. For example if it is a data table of animals I might want to know how many cats there are.

`grep -n "c" filename`
```
2:There is many cats
```
: show line number while displaying the output, it would be useful when we want to know which line the matched pattern is located.
> **Challenge** In `TestDocSearch.java`, copy the test called `testSearchCount`, rename the new test to `testSearchCount2` and change the query string being tested to `tax` rather than `taxation`.

vim TestDocSearch.java

Keypress: `/` `C` `<Enter>` `e` `a` `2` `<Esc>`
`/` `x` `a` `<Enter>` `l` `d` `w` `:` `w` `q`

`/` `C`: Search for testSearch**C**ount <br>
![01](images/01.png) <br>
`<Enter>`: Execute the search <br>
![02](images/02.png) <br>
`e`: Move cursor to the end of the word <br>
![03](images/03.png) <br>
`a`: Appending to the end of the word <br>
![04](images/04.png) <br>
`2`: Add a 2 there <br>
![05](images/05.png) <br>
`<Esc>`: Exit insert mode <br>
![06](images/06.png) <br>
`/` `x` `a`: Search for ta**xa**tion <br>
![07](images/07.png) <br>
`<Enter>`: Execute the search <br>
![08](images/08.png) <br>
`l`: Go to one character right <br>
![09](images/09.png) <br>
`d` `w`: Delete the rest of the word and left only tax <br>
![10](images/10.png) <br>
`:wq`: Save and exit the file <br>
![11](images/11.png): Execute the command <br>
`<Enter>` <br>

Part 2
1. Edit content of `test.sh` to `echo "Hello World!"` <br>
   Run `scp test.sh cs15lfa22zz@ieng6.ucsd.edu:~/` and copy the file over to remote server <br>
   Run `ssh cs15lfa22zz@ieng6.ucsd.edu "bash test.sh"` to run the file which prints `Hello World!` <br>
   64 seconds <br>
2. (In remote server) run `vim test.sh` <br>
   Edit content of `test.sh` to `echo "Hello World!"` and save the change <br>
   Run `bash test.sh` which prints `Hello World!` <br>
   30 seconds <br>

- I would prefer the second way that I don't need to copy and paste the file after I make the changes, and because it is faster.

- Most of the time I would want to use the first way if I can only run the file remotely, unless maybe if there are too many edits I need to make and I am more comfortable editing codes using VSCodes plus I don't want to make mistakes when copy pasting the codes I would probably use the first way. 

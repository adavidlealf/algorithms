# Chat room
https://codeforces.com/problemset/problem/58/A

## Problem Description
Vasya has recently learned to type and log on to the Internet. He immediately entered a chat room and decided to say hello to everybody. Vasya typed the word s. It is considered that Vasya managed to say hello if several letters can be deleted from the typed word so that it resulted in the word "hello". For example, if Vasya types the word "ahhellllloou", it will be considered that he said hello, and if he types "hlelo", it will be considered that Vasya got misunderstood and he didn't manage to say hello. Determine whether Vasya managed to say hello by the given word s.

### Input
The first and only line contains the word s, which Vasya typed. This word consisits of small Latin letters, its length is no less that 1 and no more than 100 letters.

### Output
If Vasya managed to say hello, print "YES", otherwise print "NO".

### Examples
input:
```
ahhellllloou
```

output:
```
YES
```

input:
```
hlelo
```

output:
```
NO
```

## Solution
Determining wheter s can be "hello" removing its letters is equivalent to finding the ordered sequence of each letter of "hello" in s. That is, finding the first occurrence of 'h' in s, and then finding the first occurrence of 'e' starting from the next found position of h, and so on with the rest of letters. If any of the letters has not appeared starting from the next position of its previous letter, the output is "NO", otherwise it is "YES".
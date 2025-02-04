# Boredom
https://codeforces.com/contest/455/problem/A

## Problem Description
Alex doesn't like boredom. That's why whenever he gets bored, he comes up with games. One long winter evening he came up with a game and decided to play it.

Given a sequence a consisting of n integers. The player can make several steps. In a single step he can choose an element of the sequence (let's denote it ak) and delete it, at that all elements equal to ak + 1 and ak - 1 also must be deleted from the sequence. That step brings ak points to the player.

Alex is a perfectionist, so he decided to get as many points as possible. Help him.

### Input
The first line contains integer n (1 ≤ n ≤ 105) that shows how many numbers are in Alex's sequence.

The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 105).

### Output
Print a single integer — the maximum number of points that Alex can earn.

### Examples
input:
```
2
1 2
```

output:
```
2
```

input:
```
3
1 2 3
```

output:
```
4
```

input:
```
9
1 2 1 3 2 2 2 2 3
```

output:
```
10
```

### Note
Consider the third test example. At first step we need to choose any element equal to 2. After that step our sequence looks like this [2, 2, 2, 2]. Then we do 4 steps, on each step we choose any element equals to 2. In total we earn 10 points.

## Solution
From 'Contest Materials': https://codeforces.com/blog/entry/13336

In this task we need to maximize the sum of numbers that we took. Let precalc array cnt. cnt[x] — number of integers x in array a. Now we can easily calculate the DP:

f(i) = max(f(i - 1), f(i - 2) + cnt[i]·i), 2 ≤ i ≤ n;

f(1) = cnt[1];

f(0) = 0;

The answer is f(n).

Asymptotics — O(n).
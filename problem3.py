#!/usr/bin/python
# coding=utf-8
#A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.'''

#Find the largest palindrome made from the product of two 3-digit numbers.

#Find the product of 2  3 digit numbers, one number is 999.
a = 999
b = 999
d = 0
while a >= 100 and b > 100 :
    c = a * b 
   # c = 906609
   
    #Check the answer if it palindrome
    if str(c) == str(c)[::-1]:
        #print(a,b,c)
        if c > d:
            d = c
            print a,b,d
    a = a -  1
    if a == 100:
        b = b - 1
        a = 999
print"The largest palindrome made from the product of two 3-digit numbers is: \n" ,d

  
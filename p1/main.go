package main

import "fmt"

func main() {
	counter := 0
	numList := []int{}

	for num := 1; num < 1000; num++ {
		fmt.Println(num)
		if num%3 == 0 || num%5 == 0 {
			counter += num
			numList = append(numList, num)
		}

	}
	fmt.Println(counter, numList)

}

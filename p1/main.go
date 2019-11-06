package main

import (
	"flag"
	"fmt"
)

func main() {

	fmt.Println(getNumirals())

}

func getNumirals() (int, []int) {
	counter := 0
	numList := []int{}
	details := flag.String("output", "n", "use it for detailed output")
	flag.Parse()

	for num := 1; num < 1000; num++ {
		if num%3 == 0 || num%5 == 0 {
			counter += num
			numList = append(numList, num)
		}

	}
	if *details == "y" {
		return counter, numList
	}

	return counter, nil

}

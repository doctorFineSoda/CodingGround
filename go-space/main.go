package main

import (
	"fmt"
)

func main() {

}

// fmt.Println("Hello world! :)")
// task4()
// task1()
func task1() {
	numbs := []int{2, 7, 11, 15}
	target := 9
	fmt.Printf("Element: %d\n", twoSum(numbs, target))
}

func task4() {
	numbs := []int{1, 1, 2, 3, 3, 4, 4, 8, 8}
	fmt.Printf("Element: %d\n", singleNonDuplicate(numbs))
}

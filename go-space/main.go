package main

import "fmt"

func main() {
	fmt.Println("Hello world! :)")
	task4()
}

func task4() {
	numbs := []int{1, 1, 2, 3, 3, 4, 4, 8, 8}
	fmt.Printf("Element: %d\n", singleNonDuplicate(numbs))
}

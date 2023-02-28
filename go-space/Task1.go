package main

//https://leetcode.com/problems/two-sum/

func twoSum(numbs []int, target int) []int {
	index1 := 0
	result := []int{-1, -1}
	found := false

	for index1 < len(numbs)-1 && !found {
		diff := target - numbs[index1]
		index2 := index1
		for index2 < len(numbs)-1 && !found {
			index2++
			if numbs[index2] == diff {
				result = []int{index1, index2}
				found = true
			}
		}
		index1++
	}
	return result
}

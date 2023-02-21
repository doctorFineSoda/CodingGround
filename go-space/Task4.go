package main

func singleNonDuplicate(numbs []int) int {
	left := 1
	right := len(numbs) - 1
	element := -1
	if len(numbs) == 1 || numbs[0] != numbs[1] {
		return numbs[0]
	} else if numbs[right-1] != numbs[right] {
		return numbs[right]
	}
	for left < right && element < 0 {
		if numbs[left] == numbs[left+1] || numbs[left] == numbs[left-1] {
			left++
		} else {
			element = numbs[left]
		}
	}
	return element
}

//func singleNonDuplicate(numbs []int) (element int) {
//	element = -1
//	left := 1
//	right := len(numbs) - 1
//	if left == right || numbs[0] != numbs[1] {
//		return numbs[0]
//	} else if numbs[right-1] != numbs[right] {
//		return numbs[right]
//	}
//	for left < right && element < 0 {
//		if numbs[left] == numbs[left+1] || numbs[left] == numbs[left-1] {
//			left++
//		} else {
//			element = numbs[left]
//		}
//	}
//	return
//}

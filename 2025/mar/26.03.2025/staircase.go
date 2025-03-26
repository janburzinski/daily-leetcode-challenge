package main

import "fmt"

func staircase(n int32) {
	for i := int32(1); i <= n; i++ {
		for j := int32(0); j < n-i; j++ {
			fmt.Print(" ")
		}

		for j := int32(0); j < i; j++ {
			fmt.Print("#")
		}
		fmt.Println()
	}
}

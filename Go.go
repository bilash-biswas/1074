package main

import (
	"fmt"
)

func main() {
	var N, i int
	var a [10000]int
	fmt.Scan(&N)
	for i = 0; i < N; i++ {
		fmt.Scan(&a[i])
	}
	for i = 0; i < N; i++ {
		if a[i] > 0 && a[i]%2 == 0 {
			fmt.Printf("EVEN POSITIVE\n")
		} else if a[i] < 0 && a[i]%2 == 0 {
			fmt.Printf("EVEN NEGATIVE\n")
		} else if a[i] > 0 && a[i]%2 != 0 {
			fmt.Printf("ODD POSITIVE\n")
		} else if a[i] < 0 && a[i]%2 != 0 {
			fmt.Printf("ODD NEGATIVE\n")
		} else {
			fmt.Printf("NULL\n")
		}
	}
}

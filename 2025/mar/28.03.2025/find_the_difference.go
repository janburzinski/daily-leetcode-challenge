package main

func findTheDifference(s string, t string) byte {
	c := make(map[string]int)

	// add chars from string s to map
	for _, char := range s {
		c[string(char)]++
	}

	// look for imposter
	for _, char := range t {
		c[string(char)]--
	}

	for char, count := range c {
		if count < 0 {
			return char[0]
		}
	}

	return 0
}

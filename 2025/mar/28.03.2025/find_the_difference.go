package main

func findTheDifference(s string, t string) byte {
	c := make(map[string]int)

	// add chars from string s to map
	for _, char := range s {
		c[string(char)]++
	}

	// decrease the occurance count, to see only have the characters with 0 be existing,
	// and anything lower is obviously only present in the one string
	for _, char := range t {
		c[string(char)]--
	}

	// look for imposter
	for char, count := range c {
		if count < 0 {
			return char[0]
		}
	}

	return 0
}

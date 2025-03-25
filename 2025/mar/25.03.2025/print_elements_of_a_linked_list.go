package main

import "fmt"

type SinglyLinkedListNode struct {
	data int32
	next *SinglyLinkedListNode
}

func printLinkedList(head *SinglyLinkedListNode) {
	curr := head
	for curr != nil {
		fmt.Println(curr.data)
		curr = curr.next
	}
}



Skip to content

    All gists
    Back to GitHub

    New gist
    @SindhujaDantuluri

@Sowmya6320 Sowmya6320/algo_asst.py
Last active 2 months ago •

0

    0

Code
Revisions 4
algo_asst.py
import array as arr
import random
import time

def arr(n):
	array_ = []
	for i in range(n):
		array_.append(random.randint(0,3000))
	return array_

def selection_sort(array_, n):
	start = time.time()
	a = array_
	for i in range(n-2):
		min = i
		for j in range(i+1,n-1):
			if a[j] < a[min]:
				min = j
		tmp = a[i]
		a[i] = a[min]
		a[min] = tmp
	end = time.time()
	time_ = end - start
	f.write("selectionsort: size - %d time - %d" %(n, time_))
	return a

def bubblesort(array_, n):
	start = time.time()
	a = array_
	for i in range(n-2):
		for j in range(n-2-i):
			if a[j+1] < a[j]:
				tmp = a[j]
				a[j] = a[j+1]
				a[j+1] = tmp
	end = time.time()
	time_ = end - start
	f.write("bubblesort: size - %d time - %d" %(n, time_))
	return a

def insertionsort(array_,n):
	start = time.time()
	a = array_
	for i in range(1,n):
		key = a[i]
		j = i - 1
		while j >= 0 and key < a[j]:
			a[j+1] = a[j]
			j = j - 1

		a[j+1] = key
	end = time.time()
	time_ = end - start
	f.write("insertionsort: size - %d time - %d" %(n, time_))
	return a


n = [1000,10000,50000]
f = open("algoasst.txt","w+")
for i in range(3):
	n_ = n[i]
	array_ = arr(n_)
	print n_
	selection_sort(array_, n_)
	bubblesort(array_,n_)
	insertionsort(array_,n_)
'''
output: 
selectionsort: size - 1000 time - 0 bubblesort: size - 1000 time - 0 insertionsort: size - 1000 time - 0 
selectionsort: size - 10000 time - 2 bubblesort: size - 10000 time - 2 insertionsort: size - 10000 time - 0 
selectionsort: size - 50000 time - 82 bubblesort: size - 50000 time - 100 insertionsort: size - 50000 time - 0
'''
@SindhujaDantuluri

Attach files by dragging & dropping, selecting them, or pasting from the clipboard.
Styling with Markdown is supported

    © 2019 GitHub, Inc.
    Terms
    Privacy
    Security
    Status
    Help

    Contact GitHub
    Pricing
    API
    Training
    Blog
    About


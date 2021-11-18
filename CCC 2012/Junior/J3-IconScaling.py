def scale_icon(k):
	for i in range(k):
		print("*"*k + "x"*k + "*"*k)

	for i in range(k):
		print(" "*k + "x"*k + "x"*k)

	for i in range(k):
		print("*"*k + " "*k + "*"*k)

scaling_factor = int(input())

scale_icon(scaling_factor)

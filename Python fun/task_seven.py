even = 1
total = 0 
for scores in range(1,11):
    scores = int(input("Enter any integer scores: "))
    if scores % 2 == 0:
        total = total + scores
        average = total / even
        even += 1
print(total)
print(average)

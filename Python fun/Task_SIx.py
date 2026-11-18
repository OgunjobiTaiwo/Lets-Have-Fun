even = 0
total = 0 
for scores in range(1,11):
    scores = int(input("Enter any integer scores: "))
    if scores % 2 == 0:
        total = total + scores
        even+=1
        average= total / even
print(average)

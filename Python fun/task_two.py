
sum = 0
average  = 0
count = 1
for scores in range (1, 11):
    
    scores = int(input("Enter any integer number: "))
    count+=1
sum = scores + scores
average = sum / count
print(average)

import sys

input = sys.stdin.readline

n = int(input())

for i in range(n):
    
    subjects, verbs, nouns = [], [], []
    
    num_subjects = int(input())
    num_verbs = int(input())
    num_nouns = int(input())

    for subject in range(num_subjects):
        subjects.append(input().strip())

    for verb in range(num_verbs):
        verbs.append(input().strip())

    for noun in range(num_nouns):
        nouns.append(input().strip())


    for i in range(num_subjects):
        for j in range(num_verbs):
            for k in range(num_nouns):
                print("{} {} {}.".format(subjects[i], verbs[j], nouns[k]))

import sys

input = sys.stdin.readline

cards, answers = [], []
player_a_score, player_b_score = 0, 0

for _ in range(52):
    cards.append(input().strip())

for index in range(52):
    points, player = 0, index % 2
    if cards[index] == "ace":
        points = 4
    elif cards[index] == "king":
        points = 3
    elif cards[index] == "queen":
        points = 2
    elif cards[index] == "jack":
        points = 1
    else:
        continue
    temp = points
    if index + points < 52:
        win = True
        for i in range(points):
            if (
                cards[index + i + 1] == "ace"
                or cards[index + i + 1] == "king"
                or cards[index + i + 1] == "queen"
                or cards[index + i + 1] == "jack"
            ):
                win = False
            else:
                continue
        if win:
            if player == 0:
                answers.append("Player A scores {} point(s).".format(temp))
                player_a_score += temp
            else:
                answers.append("Player B scores {} point(s).".format(temp))
                player_b_score += temp

for answer in answers:
    print(answer)

print("Player A: {} point(s).".format(player_a_score))
print("Player B: {} point(s).".format(player_b_score))

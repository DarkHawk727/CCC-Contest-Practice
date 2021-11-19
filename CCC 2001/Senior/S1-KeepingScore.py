raw_input = input()
score = 0
clubs = list(raw_input[0:raw_input.index("D")])[1:]
diamonds = list(raw_input[raw_input.index("D"):raw_input.index("H")])[1:]
hearts = list(raw_input[raw_input.index("H"):raw_input.index("S")])[1:]
spades = list(raw_input[raw_input.index("S"):])[1:]

club_score = 0
diamond_score = 0
heart_score = 0
spade_score = 0

for card in clubs:
    if card == "A":
        club_score += 4
    elif card == "K":
        club_score += 3
    elif card == "Q":
        club_score += 2
    elif card == "J":
        club_score += 1
    else:
        club_score += 0

for card in diamonds:
    if card == "A":
        diamond_score += 4
    elif card == "K":
        diamond_score += 3
    elif card == "Q":
        diamond_score += 2
    elif card == "J":
        diamond_score += 1
    else:
        diamond_score += 0

for card in hearts:
    if card == "A":
        heart_score += 4
    elif card == "K":
        heart_score += 3
    elif card == "Q":
        heart_score += 2
    elif card == "J":
        heart_score += 1
    else:
        heart_score += 0

for card in spades:
    if card == "A":
        spade_score += 4
    elif card == "K":
        spade_score += 3
    elif card == "Q":
        spade_score += 2
    elif card == "J":
        spade_score += 1
    else:
        spade_score += 0

if len(clubs) == 0:
    club_score += 3
elif len(clubs) == 1:
    club_score += 2
elif len(clubs) == 2:
    club_score += 1

if len(diamonds) == 0:
    diamond_score += 3
elif len(diamonds) == 1:
    diamond_score += 2
elif len(diamonds) == 2:
    diamond_score += 1

if len(hearts) == 0:
    heart_score += 3
elif len(hearts) == 1:
    heart_score += 2
elif len(hearts) == 2:
    heart_score += 1

if len(spades) == 0:
    spade_score += 3
elif len(spades) == 1:
    spade_score += 2 
elif len(spades) == 2:
    spade_score += 1

print("{}{:>15}".format("Cards Dealt", "Points"))
print("{} {} {:>}".format("Clubs",' '.join(str(x) for x in clubs), club_score))
print("{} {} {:>}".format("Diamonds",' '.join(str(x) for x in diamonds), diamond_score))
print("{} {} {:>}".format("Hearts",' '.join(str(x) for x in hearts), heart_score))
print("{} {} {:>}".format("Spades",' '.join(str(x) for x in spades), spade_score))
print("{} {}".format("Total", club_score + diamond_score + heart_score + spade_score))

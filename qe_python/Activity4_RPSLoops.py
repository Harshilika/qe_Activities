AnotherRound="yes"
while(AnotherRound=="yes"): 
    Player1=input("Enter player1 choice").lower()
    Player2=input("Enter Player2 choice").lower()
    if (Player1==Player2):
        print("Tie")
    elif (Player1=="rock" and Player2=="scissor"):
        print("Player1 won")
    elif Player1=="paper" and Player2=="rock":
        print("Player1 won")
    elif (Player1=="scissor" and Player2=="paper"):
        print("Player1 won")
    elif (Player2=="rock" and Player1=="scissor"):
        print("Player2 won")
    elif (Player2=="paper" and Player1=="rock"):
        print("Player2 won")
    elif (Player2=="scissor" and Player1=="paper"):
        print("Player2  won")
    else:
        print("Invalid")
    AnotherRound=input("Another Round??").lower()
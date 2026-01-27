Player1=input("Enter player1 choice").lower()
Player2=input("Enter player2 choice").lower()
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
  
"""
def RPS(p1,p2):
    match(p1.lower(),p2.lower()):
        case(move1,move2) if move1==move2:
            return "Tie"
        case("rock","scissor") | ("paper","rock") | ("scissor","paper"):
            return "Player1 wins"
        case("scissor","rock") | ("rock","paper") | ("paper","scissor"):
            return "Player2 wins"
        case _:
            return "Invalid Input"
print(RPS("Rock","Paper"))
"""
import random

print("Welcome to Rock-Paper-Scissors game!")

# list of possible choices
choices = ["rock", "paper", "scissors"]

while True:
    # computer randomly selects a choice
    computer_choice = random.choice(choices)

    # ask user to make a choice
    user_choice = input("Enter your choice (rock/paper/scissors): ")

    # validate user input
    if user_choice not in choices:
        print("Invalid choice, please try again")
        continue

    print("You chose:", user_choice)
    print("Computer chose:", computer_choice)

    # check for a tie
    if user_choice == computer_choice:
        print("It's a tie!")
    # check for a win
    elif (user_choice == "rock" and computer_choice == "scissors") or \
            (user_choice == "paper" and computer_choice == "rock") or \
            (user_choice == "scissors" and computer_choice == "paper"):
        print("You win!")
    # otherwise, user loses
    else:
        print("You lose!")

    # ask user if they want to play again
    play_again = input("Do you want to play again? (y/n): ")
    if play_again.lower() != "y":
        break

print("Thanks for playing!")


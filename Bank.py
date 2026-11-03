class BankAccount:
    def __init__(self, balance):
        self._balance = balance  # Private data

    def withdraw(self, amount):  # Method signature (handles the message)
        if amount <= self._balance:
            self._balance -= amount
            return f"Withdrew ${amount}. Remaining balance: ${self._balance}"
        return "Insufficient funds."

class User:
    def make_withdrawal(self, account, amount):
        # Sending a message to the 'account' object
        # Receiver: account | Message: 'withdraw' | Arguments: amount
        response = account.withdraw(amount) 
        print(response)

# Usage
my_account = BankAccount(100)
user = User()

user.make_withdrawal(my_account, 30)
# Output: Withdrew $30. Remaining balance: $70
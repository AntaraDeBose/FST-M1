fruit_shop = {
    "apple": 100,
    "berry": 105,
    "banana": 5,
    "strawberry": 15
}

key_to_check = input("What are you looking for? ").lower()

if(key_to_check in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")
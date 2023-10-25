PRICE_FOR_ONE_SQUARE_KM = 7.61
DISCOUNT_PERCENT = 0.18    # 18%

square_kms = float(input())

cost = square_kms * PRICE_FOR_ONE_SQUARE_KM
discount = cost * DISCOUNT_PERCENT

print(f"The final price is: {cost - discount} lv.")
print(f"The discount is: {discount} lv.")

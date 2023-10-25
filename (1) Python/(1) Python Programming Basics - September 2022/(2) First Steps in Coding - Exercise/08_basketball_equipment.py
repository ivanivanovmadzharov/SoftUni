yearly_tax = int(input())

trainers_price = yearly_tax * 0.6
outfit_price = trainers_price * 0.8
ball_price = outfit_price * 0.25
accessories_price = ball_price * 0.2

total_sum = yearly_tax + trainers_price + outfit_price + ball_price + accessories_price

print(total_sum)

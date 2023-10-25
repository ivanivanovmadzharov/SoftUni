deposed_sum = float(input())
term = int(input())
interest_per_year = float(input())

interest = deposed_sum * (interest_per_year / 100)
interest_for_month = interest / 12
total_sum = deposed_sum + term * interest_for_month

print(total_sum)

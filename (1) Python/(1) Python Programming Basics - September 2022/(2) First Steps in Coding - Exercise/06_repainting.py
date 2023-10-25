# Prices:
PRICE_OF_NYLON = 1.5
PRICE_OF_PAINT = 14.5
PRICE_OF_THINNER = 5

# Additional materials:
PERCENT_OF_PAINT = 0.1
MORE_NYLON = 2
BAGS = 0.4

PERCENT_FOR_WORKERS_PER_HOUR = 0.3

needed_nylon = int(input())
needed_paint = int(input())
needed_thinner = int(input())
hours_of_work = int(input())

nylon_sum = (needed_nylon + MORE_NYLON) * PRICE_OF_NYLON
paint_sum = (needed_paint + (needed_paint * PERCENT_OF_PAINT)) * PRICE_OF_PAINT
thinner_sum = needed_thinner * PRICE_OF_THINNER
total_sum = nylon_sum + paint_sum + thinner_sum + BAGS
work_sum = (total_sum * PERCENT_FOR_WORKERS_PER_HOUR) * hours_of_work

result = total_sum + work_sum

print(result)

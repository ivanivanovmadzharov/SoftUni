# Prices:
PRICE_OF_PENS = 5.8
PRICE_OF_MARKERS = 7.2
PRICE_OF_DETERGENT = 1.2

pens_count = int(input())
markers_count = int(input())
liters_detergent = int(input())
discount = int(input())  # In %

total_sum = (PRICE_OF_PENS * pens_count) + (PRICE_OF_MARKERS * markers_count) + (PRICE_OF_DETERGENT * liters_detergent)
total_sum -= total_sum * (discount / 100)

print(total_sum)

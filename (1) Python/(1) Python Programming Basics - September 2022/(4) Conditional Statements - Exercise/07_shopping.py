peter_budget = float(input())
video_cards = int(input())
processors = int(input())
ram_memories = int(input())

video_cards_price = video_cards * 250
processors_price = processors * (video_cards_price * 0.35)
ram_memories_price = ram_memories * (video_cards_price * 0.1)

total_price = video_cards_price + processors_price + ram_memories_price

if video_cards > processors:
    total_price = total_price * 0.85

if peter_budget >= total_price:
    print(f"You have {(peter_budget - total_price):.2f} leva left!")
else:
    print(f"Not enough money! You need {(total_price - peter_budget):.2f} leva more!")

# Prices:
CHICKEN_MENU = 10.35
FISH_MENU = 12.4
VEGETARIAN_MENU = 8.15
DESSERT_PERCENT = 0.2
DELIVERY_PRICE = 2.5

chicken_menu_count = int(input())
fish_menu_count = int(input())
vegetarian_menu_count = int(input())

sum_of_chicken_menus = CHICKEN_MENU * chicken_menu_count
sum_of_fish_menus = FISH_MENU * fish_menu_count
sum_of_vegetarian_menus = VEGETARIAN_MENU * vegetarian_menu_count
sum_of_menus = sum_of_chicken_menus + sum_of_fish_menus + sum_of_vegetarian_menus
dessert_price = sum_of_menus * DESSERT_PERCENT

result = sum_of_menus + dessert_price + DELIVERY_PRICE

print(result)

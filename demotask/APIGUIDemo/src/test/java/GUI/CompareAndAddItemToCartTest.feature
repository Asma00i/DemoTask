Feature: Compare 2 Items and add one to cart

  @CreateBug
  Scenario Outline: select 2 hot items and compare them then buy one item
    Given user navigate to Luma url and press create an account
    When user enter valid data and press create account
    When user navigate to hot sellers in home page
    When user select the third product
    When user add two products to compare list
    When user select the second product and add it to the cart.
    When user go to cart and proceed to check out
    When user fill the shipping address & payment information "<company>" "<stFAddress>" "<stSAddress>" "<stTAddress>" "<city>" "<state>" "<zip>" "<country>" "<phone>"
    When user proceed with payment.

    Examples:
      | company | stFAddress | stSAddress | stTAddress | city | state | zip    | country | phone      |
      | PayMob  | stFAddress | stSAddress | stTAddress | city | state | 350097 | USA     | 0097013125 |


Feature: Learning the use of datatables

  Scenario: To use data tables
    Given I have items:
      | item    | bottle     |  cups  |tube       |  tv    |glass      |  fan  |
      | quant   | 1000       |  2000  |340        |  20    |1009       |  2090 |
    When I buy
      |bottle   | 1000       |
    Then I should get
      |item     | quant      |
      |bottle   | 1000       |



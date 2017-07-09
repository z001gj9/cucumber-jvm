Feature: Steps are not reused between examples

  Scenario Outline: Steps are not reused between examples
    Given I have '<Initial Cukes>' cukes in the jar
    When I eat '<Eaten>' cukes
    Then There are '<Remaining>' cukes in the jar
    And I am <Fullness>

    Examples:
      | Initial Cukes | Eaten | Remaining | Fullness |
      | 6             | 2     | 4         | full     |
      | 4             | 1     | 3         | not full |
      | 6             | 2     | 4         | full     |
      | 4             | 1     | 3         | not full |
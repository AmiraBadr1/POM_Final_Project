Feature: Drag and Drop the box

  Scenario: Verify drag and drop changes the text to "Dropped!"
    Given User opens "chrome" browser "https://jqueryui.com/resources/demos/droppable/default.html"
    When User drags the draggable element and drops it into the target
    Then The drop area text should be "Dropped!"
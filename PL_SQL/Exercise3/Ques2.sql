------------------------------------------------------------
-- Exercise 3
-- Scenario 2 : Update Employee Bonus
------------------------------------------------------------

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_Department IN VARCHAR2,
    p_BonusPercent IN NUMBER
)
AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_BonusPercent / 100)
    WHERE Department = p_Department;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Employee bonus updated successfully.');
END;
/

-- Execute Procedure

BEGIN
    UpdateEmployeeBonus('IT', 10);
END;
/
DECLARE
BEGIN
    FOR cust IN (
        SELECT CustomerID
        FROM Customers
        WHERE Age > 60
    )
    LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE CustomerID = cust.CustomerID;

        DBMS_OUTPUT.PUT_LINE('Interest rate updated for Customer ID: ' || cust.CustomerID);
    END LOOP;

    COMMIT;
END;
/
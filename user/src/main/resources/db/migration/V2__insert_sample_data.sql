-- Insert Users
INSERT INTO users (user_name, password) VALUES
                                            ('Ahmed', '123456'),
                                            ('Sara', 'sara123');

-- Insert Orders (with dummy total prices)
INSERT INTO orders (total_price, user_id) VALUES
                                              (2400.00, 1),  -- Ahmed
                                              (800.00, 2);   -- Sara

-- Insert Products (linked to orders)
INSERT INTO products (product_name, quantity, price, order_id) VALUES
                                                                   ('Laptop', 2, 1200.00, 1),     -- Ahmed ordered 2 laptops
                                                                   ('Smartphone', 1, 800.00, 2); -- Sara ordered 1 smartphone

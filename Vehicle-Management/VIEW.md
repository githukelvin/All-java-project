<code>
     ConnectToMysql conn = new ConnectToMysql();
        conn.connectToDB();

        Connection connection = conn.connection;

        // Create a query to get all vehicles
        String query = "SELECT * FROM vehicle";

        try {
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = statement.executeQuery(query);

            resultSet.last();
            int numberOfRows = resultSet.getRow();
            resultSet.beforeFirst();

            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();

            Object[][] data = new Object[numberOfRows][numberOfColumns];

            int row = 0;
            while (resultSet.next()) {
                for (int column = 0; column < numberOfColumns; column++) {
                    data[row][column] = resultSet.getObject(column + 1);
                }
                row++;
            }

            String[] columnNames = { "vehicleMake", "vehicleName", "vehicleModel", "vehicleYear", "vehiclePrice",
                    "vehicleColor", "bodyType", "noOfDoors", "Space" };

            // Create a JTable with the data and column names
            JTable table = new JTable(data, columnNames);

            // Create a scroll pane and add the table to it
            JScrollPane scrollPane = new JScrollPane(table);

            // Create a panel and add the scroll pane to it
            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());
            panel.add(scrollPane, BorderLayout.CENTER);

            // Create a frame and add the panel to it
            JFrame frame = new JFrame("View Vehicle");
            frame.setSize(1000, 1000);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(panel);

            // Set the frame to be visible
            frame.setVisible(true);

            // Close the connection and statement
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }

</code>
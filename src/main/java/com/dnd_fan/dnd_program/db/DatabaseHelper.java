package com.dnd_fan.dnd_program.db;

import com.dnd_fan.dnd_program.model.Character;

import java.io.File;
import java.sql.*;

public class DatabaseHelper {
    public static final String DEFAULT_DATA_FILE_NAME = "data.dat";

    // TODO: Expand this table
    public static final String CREATE_CHARACTER_TABLE = "CREATE TABLE Character" +
            "(" +
            "   Name            VARCHAR(100)    ," +
            "   Class           VARCHAR(50)     ," +
            "   Subclass        VARCHAR(50)     ," +
            "   Level           INTEGER         ," +
            "   Copper          INTEGER         ," +
            "   Silver          INTEGER         ," +
            "   Gold            INTEGER         ," +
            "   Platinum        INTEGER         ," +
            "   Strength        INTEGER         ," +
            "   Intelligence    INTEGER         ," +
            "   Dexterity       INTEGER         ," +
            "   Wisdom          INTEGER         ," +
            "   Constitution    INTEGER         ," +
            "   Charisma        INTEGER          " +
            ")";

    // TODO: Expand this table
    public static final String CREATE_NOTES_TABLE = "CREATE TABLE Notes" +
            "(" +
            "   CharacterID     INTEGER         ," +
            "   Note            VARCHAR(50000)  ," +
            "   Tag             VARCHAR(100)     " +
            ")";

    // TODO: Expand this table
    public static final String CREATE_CHARACTER_INVENTORY_TABLE = "CREATE TABLE CharacterInventory" +
            "(" +
            "   CharacterID     INTEGER         ," +
            "   ItemName        VARCHAR(100)    ," +
            "   Tag             VARCHAR(100)    ," +
            "   IsCustom        INTEGER          " +
            ")";

    // TODO: Expand this table
    public static final String CREATE_CUSTOM_ITEMS_TABLE = "CREATE TABLE CustomItem" +
            "(" +
            "   Name            VARCHAR(100)    ," +
            "   Description     VARCHAR(10000)  ," +
            "   DateCreated     TEXT             " +
            ")";

    //region[CharacterQueries]

    public static final String QUERY_GET_CHARACTERS = "SELECT " +
            "ROWID, Name, Class, Subclass, Level, Copper, Silver, Gold, Platinum " +
            "FROM Character";

    public static final String INSERT_CHARACTER = "INSERT INTO Character VALUES" +
            "(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static final String UPDATE_CHARACTER_BY_ID = "UPDATE Character" +
            "SET    NAME = ?," +
            "       Class = ?," +
            "       Subclass = ?," +
            "       Level = ?," +
            "       Copper = ?," +
            "       Silver = ?," +
            "       Gold = ?," +
            "       Platinum = ?," +
            "       Strength = ?," +
            "       Intelligence = ?," +
            "       Dexterity = ?," +
            "       Wisdom = ?," +
            "       Constitution = ?," +
            "       Charisma = ?" +
            "WHERE ROWID = ?";

    public static final String DELETE_CHARACTER_BY_ID = "DELETE FROM Character WHERE ROWID = ?";

    //region

    private static DatabaseHelper sInstance;

    private Connection mDatabaseConnection;

    public static synchronized DatabaseHelper getDatabaseHelper() {
        if (sInstance == null)
            sInstance = new DatabaseHelper();

        return sInstance;
    }

    private DatabaseHelper() {
        boolean create = false;
        File databaseFile = new File(DEFAULT_DATA_FILE_NAME);

        if (!databaseFile.exists())
            create = true;

        try {
            mDatabaseConnection = DriverManager.getConnection("jdbc:sqlite:" + DEFAULT_DATA_FILE_NAME);
        } catch (SQLException e) {
            // TODO: Handle this part
            e.printStackTrace();
        }

        if (create) {
            try {
                mDatabaseConnection.prepareStatement(CREATE_CHARACTER_TABLE);
                mDatabaseConnection.prepareStatement(CREATE_NOTES_TABLE);
                mDatabaseConnection.prepareStatement(CREATE_CHARACTER_INVENTORY_TABLE);
                mDatabaseConnection.prepareStatement(CREATE_CUSTOM_ITEMS_TABLE);
            } catch (SQLException e) {
                // TODO: Handle this part
                e.printStackTrace();
            }
        }
    }

    /**
     * Get a character list of all currently created characters
     * @return
     * An array of characters
     */
    public Character[] getCharacters() {
        try {
            PreparedStatement stmt = mDatabaseConnection.prepareStatement(QUERY_GET_CHARACTERS);
            stmt.execute();
            ResultSet results = stmt.getResultSet();

            Character[] toReturnCharacters = new Character[results.getFetchSize()];
            for (int i = 0;results.next();i ++) {
                toReturnCharacters[i] = new Character(
                        results.getInt(1),
                        results.getString(2),
                        results.getString(3),
                        results.getString(4),
                        results.getInt(5),
                        results.getInt(6),
                        results.getInt(7),
                        results.getInt(8),
                        results.getInt(9),
                        results.getInt(10),
                        results.getInt(11),
                        results.getInt(12),
                        results.getInt(13),
                        results.getInt(14),
                        results.getInt(15)
                );
            }

            return toReturnCharacters;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Create a new character in the database
     * @param toCreate
     * The new character, which is to be inserted into the database
     */
    public void createCharacter(Character toCreate) {
        try {
            PreparedStatement stmt = mDatabaseConnection.prepareStatement(INSERT_CHARACTER);

            stmt.setString(1, toCreate.getCharacterName());
            stmt.setString(2, toCreate.getCharacterClass());
            stmt.setString(3, toCreate.getCharacterSubclass());
            stmt.setInt(4, toCreate.getCharacterLevel());
            stmt.setInt(5, toCreate.getCharacterCopperCount());
            stmt.setInt(6, toCreate.getCharacterSilverCount());
            stmt.setInt(7, toCreate.getCharacterGoldCount());
            stmt.setInt(8, toCreate.getCharacterPlatinumCount());
            stmt.setInt(9, toCreate.getStrength());
            stmt.setInt(10, toCreate.getIntelligence());
            stmt.setInt(11, toCreate.getDexterity());
            stmt.setInt(12, toCreate.getWisdom());
            stmt.setInt(13, toCreate.getConstitution());
            stmt.setInt(14, toCreate.getCharisma());

            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateCharacter(Character character) {
        try {
            PreparedStatement stmt = mDatabaseConnection.prepareStatement(UPDATE_CHARACTER_BY_ID);

            stmt.setString(1, character.getCharacterName());
            stmt.setString(2, character.getCharacterClass());
            stmt.setString(3, character.getCharacterSubclass());
            stmt.setInt(4, character.getCharacterLevel());
            stmt.setInt(5, character.getCharacterCopperCount());
            stmt.setInt(6, character.getCharacterSilverCount());
            stmt.setInt(7, character.getCharacterGoldCount());
            stmt.setInt(8, character.getCharacterPlatinumCount());
            stmt.setInt(9, character.getStrength());
            stmt.setInt(10, character.getIntelligence());
            stmt.setInt(11, character.getDexterity());
            stmt.setInt(12, character.getWisdom());
            stmt.setInt(13, character.getConstitution());
            stmt.setInt(14, character.getCharisma());
            stmt.setInt(15, character.getCharacterId());

            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCharacterById(int characterId) {
        try {
            PreparedStatement stmt = mDatabaseConnection.prepareStatement(DELETE_CHARACTER_BY_ID);

            stmt.setInt(1, characterId);

            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

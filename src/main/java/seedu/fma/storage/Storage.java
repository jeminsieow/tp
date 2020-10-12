package seedu.fma.storage;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import seedu.fma.commons.exceptions.DataConversionException;
import seedu.fma.model.ReadOnlyAddressBook;
import seedu.fma.model.ReadOnlyUserPrefs;
import seedu.fma.model.UserPrefs;

/**
 * API of the Storage component
 */
public interface Storage extends LogBookStorage, UserPrefsStorage {

    @Override
    Optional<UserPrefs> readUserPrefs() throws DataConversionException, IOException;

    @Override
    void saveUserPrefs(ReadOnlyUserPrefs userPrefs) throws IOException;

    @Override
    Path getLogBookFilePath();

    @Override
    Optional<ReadOnlyAddressBook> readLogBook() throws DataConversionException, IOException;

    @Override
    void saveLogBook(ReadOnlyAddressBook logBook) throws IOException;

}

package ru.mirea.practice24.documents;

public interface ICreateDocument {
    IDocument createNew(String name);
    IDocument createOpen(int index);
    void pushDocument(IDocument document);
    void saveData();
    int getDocumentsCount();
}

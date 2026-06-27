package ru.aston.hometask.Module3.Proxy;

public class DataLoaderProxy implements DataLoad{

    private DataLoader dataLoader;
    private String dataCache;
    private boolean dataCached;

    public DataLoaderProxy() {
        this.dataCached = false;
    }

    private void lazyInitData(){
        if (dataLoader == null){
            dataLoader = new DataLoader();
        }
    }

    @Override
    public String getData() {
        if (dataCached){
            System.out.println("Выгрузка данных из кэша");
            return dataCache;
        }

        lazyInitData();
        dataCache = dataLoader.getData();
        dataCached = true;
        System.out.println("Данные сохранены в кэш");

        return dataCache;
    }

    public boolean isDataCached() {
        return dataCached;
    }
}

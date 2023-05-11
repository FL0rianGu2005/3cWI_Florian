package at.gfl.ObjektOrientierung.Handy;

import java.util.ArrayList;
import java.util.List;

public class SD_Card {
        private int capacity;
        private List<File> files;

        public SD_Card(int capacity)
        {
            this.capacity=capacity;
            this.files = new ArrayList<>();
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        public List<File> getPhotoFiles() {
            return files;
        }

        public void setPhotoFiles(List<File> files) {
            this.files = files;
        }
}
